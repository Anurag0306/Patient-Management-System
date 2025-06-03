#!/bin/bash
set -e # Stops the script if any command fails

echo "Deleting existing stack (if any)..."
aws --endpoint-url=http://localhost:4566 cloudformation delete-stack \
    --stack-name patient-management-system

echo "Waiting for stack deletion to complete..."
aws --endpoint-url=http://localhost:4566 cloudformation wait stack-delete-complete \
    --stack-name patient-management-system || echo "Stack did not exist, continuing..."

echo "Deploying new stack..."
aws --endpoint-url=http://localhost:4566 cloudformation deploy \
    --stack-name patient-management \
    --template-file "./cdk.out/localstack.template.json"

echo "Waiting for stack creation to complete..."
aws --endpoint-url=http://localhost:4566 cloudformation wait stack-create-complete \
    --stack-name patient-management

echo "Fetching Load Balancer DNS..."
aws --endpoint-url=http://localhost:4566 elbv2 describe-load-balancers \
    --query "LoadBalancers[0].DNSName" --output text

# xalts-demo

To Create a docker image Use the following command
docker build -t <your-image-name> .

Create a EC2 Instance in AWS through terraform
1. Go the Terraform from the parent folder
2. Run terraform plan, init, apply, once the ec2 instance is created , we can try to connect to the ec2 instance using 
ssh -i <pem-key>.pem ec2-user@your-ec2-public-ip
docker run -d -p 8080:8080 <image-name>
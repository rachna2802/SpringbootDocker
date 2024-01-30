# SpringbootDocker
spring web MS ,JPA Docker
#dockers command to build and pusht the image

# Initialize the builder (only need to run this once)
docker buildx create --use

# Build the Docker image with the specified tag
docker buildx build -t userms .



docker build -t userms .

tag the port:
docker run -p 8082:8082 userms

docker tag userms:latest rachna2802/userms:latest

docker push rachna2802/userms:latest

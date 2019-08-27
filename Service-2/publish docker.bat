
::docker push alessandropiccione/aws-public:latest

docker tag flaskapp:latest alessandropiccione/service-two:latest
docker push alessandropiccione/service-two:latest

pause
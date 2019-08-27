:: docker build -t <new-image-name:tag> <context (path to copy in the image)>

docker build -t flaskapp:latest . 

:: multiple repository
docker build -t flaskapp:${build_number} -t flaskapp:latest . 


pause
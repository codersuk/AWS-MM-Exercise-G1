FROM alpine:3.10

# Small. Simple. Secure. Alpine Linux is a security-oriented, lightweight Linux distribution based on musl libc and busybox.
# 4 Mb!
# Ubuntu use apk

# install Python 3 and pip (python3-dev contains Python 3 and pip) and update pip 
RUN apk add --no-cache python3-dev \  
    && pip3 install --upgrade pip

COPY ./src /app

WORKDIR /app

RUN pip3 --no-cache-dir install -r requirements.txt

# expose internal port 5000 to 80
EXPOSE 5000

# make the container executable
# run our app
# try this: ENTRYPOINT [ "python app.py", "app.py" ] 

# the command
ENTRYPOINT ["python3"] 
CMD ["app.py"]
# the parameters to pass to it
#CMD python3 app.py

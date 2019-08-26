#FROM alpine:3.10
FROM python:3-onbuild

# Small. Simple. Secure. Alpine Linux is a security-oriented, lightweight Linux distribution based on musl libc and busybox.
# 4 Mb!

# install Python 3 and pip (python3-dev contains Python 3 and pip) and update pip 
RUN apk add --no-cache python3-dev \  
    && pip3 install --upgrade pip

COPY ./src usr/src/app

WORKDIR usr/src/app

RUN pip3 --no-cache-dir install -r requirements.txt

EXPOSE 5000

CMD python3 app.py

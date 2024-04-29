# BlueLM



#### 使用说明

0. 进入目录
```
cd blue-lm
```

1.  build
```
docker run -it --rm --name ssadmin-maven \
    -v ssadmin-maven-repo:/root/.m2 \
    -v "$PWD/src/backend":/usr/src/mymaven \
    -w /usr/src/mymaven \
    jack666ie/javamaven:21396 mvn clean install package -e -Dmaven.test.skip=true
```
2.  执行命令
```
docker compose up -d
```

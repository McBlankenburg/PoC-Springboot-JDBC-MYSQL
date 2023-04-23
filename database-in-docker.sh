docker run -d \
--name my-mysql \
-e MYSQL_ROOT_PASSWORD=password \
-e MYSQL_DATABASE=mydb \
-v $PWD/src/main/resources/db/:/docker-entrypoint-initdb.d \
-p 3306:3306 \
mysql
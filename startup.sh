#!/bin/bash
kill $(cat ./pid.file)
nohup java -jar /var/www/html/suchapp-0.0.1-SNAPSHOT.jar & echo $! > ./pid.file > /dev/null 2> /dev/null < /dev/null & 

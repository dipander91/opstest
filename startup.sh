#!/bin/bash
nohup java -jar /var/www/html/suchapp-0.0.1-SNAPSHOT.jar &
/dev/null 2> /dev/null < /dev/null &
exit 0

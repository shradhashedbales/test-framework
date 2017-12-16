how to use selenium grid:

selenium grid is used to run test parallely
its is also used to run the builds on multiple browser local as well as remote driver macjhine

its a kind of hub which is connected with different virtual machines.

1)To start the hub :

open the cmd command and navigate where your selenium standlone server is copied and apply

The below command in commad prompt

java -jar selenium-server-standalone-2.44.0.jar -role hub

2) To start the nodes :

open the cmd on your local machine and navigate the copied selenium server file

and add the below command to run the node:

java -jar selenium-server-standalone-2.44.0.jar -role node  -hub http://localhost:4444/grid/register

Configuring the selenium grid

ADD below steps in basemain page by using if else condition

The condition follows if true runs the grid if false runs on the local machine.

the next step is to add all the browser drivers to run on multiple browser by adding drivers

download the drivers through below link :
Download the latest Firefox/Chrome/IE & Safari Drivers
http://www.seleniumhq.org/download/









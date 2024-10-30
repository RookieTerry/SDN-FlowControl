# SDN-FlowControl
## Description
This is a Malicious Data Flow Control System within Software Defined Networks, developed by me during my bachelor's degree in 2023.
## How to run
To run this code, you have to install JDK 1.8 on your physical machine. This project use a Mininet programme in Ubuntu virtual machine to simulate a simple SDN topology.
However, I lost the script to set up a virtual network after reinstalling my OS.
## Source file functions
- entity/Bucket.java -> Bucket in group table entry
- entity/FlowEntry.java -> defines the necessary fields in flow table entry, as well as methods for setting and getting fields
- entity/GroupEntry.java -> defines the necessary fields in group table entry, as well as methods for setting and getting fields
- sdn/Add.java -> creates flow table entry and adds flow table to switch
- sdn/Delete.java -> deletes flow table entry
- sdn/GroupAdd.java -> adds group table entry and adds group table to switch
- sdn/List.java -> displays flow table entry
- tools/Constant.java -> defines constants used in the experiment
- tools/FlowTableTool.java -> defines operations for adding flow table entry to the specified switch and clearing flow table entry
- tools/HttpRequest.java -> defines GET and POST methods used to send HTTP requests to the specified URL of the controller

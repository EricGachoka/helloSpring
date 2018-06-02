The project uses Spring Boot v 2.0.2
and Thymeleaf templating to demonstrate 
how to create a simple REST api with
Spring Boot.
========================================
The server is configured to run at port 8000
as seen in application.yml file.

At 'localhost:8000/', the app responds with
"Spring said welcome". This is because the
file index.html in the 'static' directory
is served by default.

At 'localhost:8000/api/greeting', the app responds
with "Spring said Hello!". This rest controller is
configured in the 'DemoApplication' file.

At 'localhost:8000/api/suppliers', the app responds
with a list of suppliers in xml format if you
send the request using a browser. However the
response is actually in json format, as usual.
You can see it in json if you send the request 
using a tool like postman or httpie. This REST
behavior is configured in the file ApiController.

At 'localhost:8000/suppliers', you are presented 
with a table of suppliers where a spring MVC architecture
is used. Thymeleaf is used to display the data in the
template. The model is the Supplier class, the view is
the suppliers.html file and the controller is the
SupplierController class. The url calls the SupplierController
which gets the suppliers from the SupplierServices class,
stores it in the model as an attribute and forwards control
to the suppliers.html file for display.

**NOTE:** 
All Suppliers data comes from the SupplierServices class
which is component scanned by spring boot and data is made available
at startup.
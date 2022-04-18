# Calculator-MS

## Minimun requirements
### Java 11
### Maven 3.8.1

## From terminal:

`mkdir test
cd test`
`git clone https://github.com/basiliomendozadelgado/Calculator-MS.git`
`cd Calculator-MS`

### To generate jar:

`mvn validate`
`mvn install`

### To execute jar:
#### For Windows SO
`java -jar target\calculator-ms-0.1.0-SNAPSHOT.jar`

#### For Linux/Mac SO
`java -jar target/calculator-ms-0.1.0-SNAPSHOT.jar`


## To use this calculator (With Rest client, for example Postman):
#### Two endpoints are exposed for each operation in the API.
##### Main path:

* http://IP_HOST:8080/api/v1

Where IP_HOST the server is located (for example, localhost to local).


##### To do the calculation of the sum of two elements, these must be passed by parameters in the path, such as:
* http://IP_HOST:8080/api/v1/addition?elem1=X&elem2=Y

Where X is the first element and Y the second.


##### And for the calculation of the subtraction of two elements, parameters must also be passed in the path, such as:

* http://IP_HOST:8080/api/v1/subtraction?elem1=X&elem2=Y

Where X is the first element and Y the second.


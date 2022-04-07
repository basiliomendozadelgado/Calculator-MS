# Calculator-MS


###To use this calculator, two endpoints are exposed for each operation in the API. The main path:

http://IP_HOST:8080/api/v1

Where IP_HOST where the server is located (localhost for local for example).


#####To do the calculation of the sum of two elements, these must be passed by parameters in the path, such as:
http://IP_HOST:8080/api/v1/additional?elem1=X&elem2=Y

Where X is the first element and Y the second.


#####And for the calculation of the subtraction of two elements, parameters must also be passed in the path, such as:

http://IP_HOST:8080/api/v1/subtraction?elem1=X&elem2=Y

Where X is the first element and Y the second.

--- Rest API for transform text ---

 Default port is : 8888
 Default path mapping for Text controller is : /api 
 Path for request is: /transformText
 Method is: POST
 Input body format is: json
 Output body format is: json
 
--- example call after run (mvn spring-boot:run) ---
 
 POST: localhost:8888/api/transformsText/
 Request json body : {
                   "input":"Ahoj, jak se máš?"
                     }
 Response json body : {
                    "output": "?šÁm es kaj ,jOha"
                      }                   
 
PS: V zadání je věta "Na pozici, kde se původně vyskytovala písmena a,e,i,o,u budou nově písmena uppercase, všechna ostatní písmena budou lowercase."
V příkladu, který je uveden v zadání i zde v Request a Response json body se mění velikost písmene na pozici kde je písmeno "á" a to z "o" na "O".
Proto jsem bral zadnání ve kterém beru a = á, e = {ě,é} atd.


 
 
 
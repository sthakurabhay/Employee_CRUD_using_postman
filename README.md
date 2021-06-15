# Employee_CRUD_using_postman

//Run the project as a java application in sprint tool suit then open postman and type following commands


//to insert valuies in database
Post - localhost:8080/emps
{
        "empid": 570,
        "empname": "Chakradhar",
        "empaddress": "Kolkata",
        "empsal": 650000
}

//to fetch the data from database
get-localhost:8080/emp

//todelete the data from database 
Delete-localhost:8080/emp/(emp-id)

//to update the data in the database
Put-localhost:8080/emps
{
        "empid": 570,
        "empname": "Chakradhar",
        "empaddress": "Lucknow",
        "empsal": 650000
}

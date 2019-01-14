var express = require("express");
var bodyParser = require("body-parser");
var userCtrl = require('./controller/user');
var app = express();

app.use(express.static(__dirname+'/public'));
app.use(bodyParser.json());
app.use(bodyParser.urlencoded({extended:false}));

var mongoose = require('mongoose');

mongoose.Promise = global.Promise;
var promise = mongoose.connect("mongodb://localhost:27017/mercury",{
	useNewUrlParser: true,
	useCreateIndex: true
});
promise.then(function() {
	console.log("Mongodb connected!");
},function() {
	console.log("Mongodb connect fail");
});

app.get("/users",userCtrl.getUsers);
app.post("/users",userCtrl.postUsers);
app.put("/users",userCtrl.putUsers);
app.delete("/users/:id",userCtrl.deleteUsers);
app.listen(process.env.PORT || 3000);

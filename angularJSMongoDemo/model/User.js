var mongoose = require('mongoose');
var Schema = mongoose.Schema;

var UserSchema = new Schema({
	name:{type:String,unique:true,required:true},
	age:Number,
	city:String,
	state:String
},{collections:'Testusers'});

var User = mongoose.model('employees',UserSchema);

module.exports = User;


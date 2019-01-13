var mongoose = require('mongoose');
var Schema = mongoose.Schema;

var UserSchema = new Schema({
	name:{type:String,unique:true,required:true},
	age:Number,
	city:String,
	state:String
},{collections:'users'});

var User = mongoose.model('User',UserSchema);

module.exports = User;


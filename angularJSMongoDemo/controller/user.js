var User = require("../model/User");

exports.getUsers = function(req,res,next) {
	User.find(function(err,docs) {
		res.json(docs);
	});
};

exports.postUsers = function(req,res,next) {
	var user = new User(req.body);
	user.save(function(err) {
		if(err) {
			res.json({
				success:false
			});
		}else {
			res.json({
				success:true
			});
		}
	});
};

exports.putUsers = function(req,res,next) {
	var users = new User(req.body);
	console.log(users);
	User.updateOne({_id:users._id},{$set:users},function(err) {});
	console.log("update successfully");
};

exports.deleteUsers = function(req,res,next) {
	var id = req.params.id;
	// var user = new User(req.body);
	User.remove({_id:id},function(er){});
}
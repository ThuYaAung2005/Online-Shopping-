let db = "products";

function addItemToDB(id) {
	var items=getAllFromDB();
		if(items.length < 1){
			items.push([id,1]);
			saveToDB(items);
		}else{
			if(!checkItemExist(id)){
				items.push([id,1]);
				saveToDB(items);
			}
		}
}
function checkItemExist(id) {
	var bol = false;
	var items = getAllFromDB();
	items.forEach((items) => {
		if (items[0] == id) {
			items[1] =items[1] + 1;
			bol = true;
		}
		saveToDB(items);
		return bol;
	});
}
function clearDB() {
	localStorage.removeItem(db);
}

function saveToDB(items) {
	localStorage.setItem(db, JSON.stringify(items));
	var items=getAllFromDB();
	document.getElementById("cartCount").innerHTML = items.length; 
//	updateItemCount();
}
/*function updateItemCount(){
	0

}
*/
function getAllFromDB() {
	let items = localStorage.getItem(db);
	if (items == null) {
		return [];
	}
	return JSON.parse(items);
}
package part6ClassIntroductions;

 class Box {

	double width;
	double height;
	double depth;
	
	Box(){
		System.out.println("Конструирование объёкта Box");
		width = 10;
		height = 10;
		depth = 10;
	}
	
	Box(double w, double h, double d){
		width = w;
		height = h;
		depth = d;
	}
	
//	Вычисляет и возращает объём
	double volume() {
		return width * height * depth;
	}
	
//	Установка размеров параллелипипеда
	void setDim(double w, double h, double d) {
		width = w;
		height = h;
		depth = d;
	}

}

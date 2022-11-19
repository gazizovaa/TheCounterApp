# The Counter App

📱The Counter App, which is my first Android app, is used for counting the things at once a time. This app is based on 4 main steps: 
      1. Layout Design,
      2. Declaring Widgets (I used two TextView's and Button View in the process of creating the app).
      3. Functions (handling click events),
      4. Run & Testing.
      
💡During the project I wrote some lines of code below inside main activity to click a button on the app ->
 
     
      btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                counter_text.setText(""+increaseCounter());
            }
        });
        
        
        
 After this, I created new method called 📌increaseCounter() outside of onCreate method that increases the counter variable by pre increment. A the end, I called that inside of onClick() method using setText() .
 
 
 ![counter_app_image](https://user-images.githubusercontent.com/78263828/202873391-10a4fc03-21c5-4420-81b1-47d286d2674d.png)









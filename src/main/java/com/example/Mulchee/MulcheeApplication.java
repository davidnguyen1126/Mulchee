package com.example.Mulchee;

import com.google.auth.oauth2.GoogleCredentials;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.FileInputStream;
import java.io.IOException;

@SpringBootApplication
public class MulcheeApplication {

	public static void main(String[] args) throws IOException {
		try {
			FileInputStream serviceAccount =
					new FileInputStream("/Users/davidnguyen/Downloads/Mulchee/src/main/resources/serviceAccountKey.json");

			FirebaseOptions options = new FirebaseOptions.Builder()
					.setCredentials(GoogleCredentials.fromStream(serviceAccount))
					.build();

			FirebaseApp.initializeApp(options);
		} catch (Exception e) {
			e.printStackTrace();
		}




		SpringApplication.run(MulcheeApplication.class, args);
	}

}

package com.example.table.table_folder;

import org.springframework.boot.SpringApplication;

public class TestTableFolderApplication {

	public static void main(String[] args) {
		SpringApplication.from(TableFolderApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}

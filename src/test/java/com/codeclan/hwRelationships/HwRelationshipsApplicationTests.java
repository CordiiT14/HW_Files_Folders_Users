package com.codeclan.hwRelationships;

import com.codeclan.hwRelationships.models.File;
import com.codeclan.hwRelationships.models.Folder;
import com.codeclan.hwRelationships.models.User;
import com.codeclan.hwRelationships.repositories.FileRepository;
import com.codeclan.hwRelationships.repositories.FolderRepository;
import com.codeclan.hwRelationships.repositories.UserRepository;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class HwRelationshipsApplicationTests {

	@Autowired
	FileRepository fileRepository;

	@Autowired
	FolderRepository folderRepository;

	@Autowired
	UserRepository userRepository;

	@Test
	void contextLoads() {
	}

//	@Test
//	public void canAddFile(){
//		File file = new File("my_doc", "doc", 2);
//		fileRepository.save(file);
//	}
//
//	@Test
//	public void canAddFolder(){
//		Folder folder = new Folder("passwords_saved_here");
//		folderRepository.save(folder);
//	}
//
//	@Test
//	public void canAddUser(){
//		User user = new User("Robbie");
//		userRepository.save(user);
//	}

	//------Added folder and file to db, only file has folder_id, folders have no column for files
//	@Test
//	public void canAddFileAndFolder(){
//		Folder folder = new Folder("passwords_saved_here");
//		folderRepository.save(folder);
//
//		File file = new File("my_doc", "doc", 2, folder);
//		fileRepository.save(file);
//	}

	@Test
	public void canAddUserAndFolderandFiles(){
		User user = new User("Robbie");
		userRepository.save(user);

		Folder folder = new Folder("important", user);
		folderRepository.save(folder);

		File file = new File("my_doc", "doc", 2, folder);
		fileRepository.save(file);
	}

}

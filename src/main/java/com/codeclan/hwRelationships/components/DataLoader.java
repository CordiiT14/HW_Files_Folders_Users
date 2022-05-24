package com.codeclan.hwRelationships.components;

import com.codeclan.hwRelationships.models.File;
import com.codeclan.hwRelationships.models.Folder;
import com.codeclan.hwRelationships.models.User;
import com.codeclan.hwRelationships.repositories.FileRepository;
import com.codeclan.hwRelationships.repositories.FolderRepository;
import com.codeclan.hwRelationships.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.nio.file.Files;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    FileRepository fileRepository;

    @Autowired
    FolderRepository folderRepository;

    @Autowired
    UserRepository userRepository;

    public DataLoader(){

    }

    @Override
    public void run(ApplicationArguments args){
        User user1 = new User("Robbie");
        userRepository.save(user1);

        User user2 = new User("Ella");
        userRepository.save(user2);

        User user3 = new User("Bex");
        userRepository.save(user3);

        Folder folder1 = new Folder("documents", user1);
        folderRepository.save(folder1);

        Folder folder2 = new Folder("pictures", user2);
        folderRepository.save(folder2);

        Folder folder3 = new Folder("passwords", user3);
        folderRepository.save(folder3);

        Folder folder4 = new Folder("downloads", user1 );
        folderRepository.save(folder4);

        File file1 = new File("cover_letter", "doc", 20, folder1);
        fileRepository.save(file1);

        File file2 = new File("cover_letter2", "doc", 23, folder1);
        fileRepository.save(file2);

        File file3 = new File("headshot", "doc", 20, folder2);
        fileRepository.save(file3);

        File file4 = new File("edited_headshot", "doc", 27, folder2);
        fileRepository.save(file4);

        File file5 = new File("totally_not_my_passwords", "xls", 20, folder3);
        fileRepository.save(file5);

    }
}

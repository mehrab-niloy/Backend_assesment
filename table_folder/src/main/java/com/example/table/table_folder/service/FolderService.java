package com.example.table.table_folder.service;


import com.example.table.table_folder.folder.Foldertable;
import com.example.table.table_folder.repository.Repositoryfolder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FolderService {

    @Autowired
    private Repositoryfolder repositoryfolder;

    public List<Integer> getFolderIdsByParentId(Integer parentId) {
        List<Integer> folderIds = new ArrayList<>();
        getFolderIdsRecursively(parentId, folderIds);
        return folderIds;
    }

    private void getFolderIdsRecursively(Integer parentId, List<Integer> folderIds) {
        folderIds.add(parentId);
        List<Foldertable> childFolders = repositoryfolder.findByParentId(parentId);
        for (Foldertable folder : childFolders) {
            getFolderIdsRecursively(folder.getId(), folderIds);
        }
    }


//    public Foldertable addFolder(FolderDTO folderDTO) {
//        Foldertable folder = new Foldertable();
//        folder.setParentId(folderDTO.getParentId());
//        return repositoryfolder.save(folder);
//    }


    public Foldertable addFolder(Foldertable foldertable){

        return repositoryfolder.save(foldertable);
    }

}

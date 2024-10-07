package com.example.table.table_folder.controller;


import com.example.table.table_folder.folder.FolderResponse;
import com.example.table.table_folder.folder.Foldertable;
import com.example.table.table_folder.service.FolderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class FolderController {

    @Autowired
    private FolderService folderService;

    @GetMapping("/getidbyfolderid/{folderid}")
    public FolderResponse getFolderIdsByFolderId(@PathVariable("folderid") Integer folderId) {
        List<Integer> folderIds = folderService.getFolderIdsByParentId(folderId);
        return new FolderResponse(folderIds);
    }


    @PostMapping("/addFolder")
    public Foldertable addFolder(@RequestBody Foldertable foldertable) {
        return folderService.addFolder(foldertable);
    }
}

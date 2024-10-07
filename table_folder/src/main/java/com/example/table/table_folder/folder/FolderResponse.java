package com.example.table.table_folder.folder;

import java.util.List;


public class FolderResponse {
    private List<Integer> folderids;

    public FolderResponse(List<Integer> folderids) {
        this.folderids = folderids;
    }

    public List<Integer> getFolderids() {
        return folderids;
    }

    public void setFolderids(List<Integer> folderids) {
        this.folderids = folderids;
    }
}

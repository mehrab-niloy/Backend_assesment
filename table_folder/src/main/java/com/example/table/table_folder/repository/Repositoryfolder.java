package com.example.table.table_folder.repository;


import com.example.table.table_folder.folder.Foldertable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Repositoryfolder extends JpaRepository<Foldertable, Integer> {
    List<Foldertable> findByParentId(Integer parentId);
}

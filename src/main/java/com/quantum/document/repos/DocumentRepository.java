package com.quantum.document.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.quantum.document.entities.Document;

public interface DocumentRepository extends JpaRepository<Document, Long>{

}

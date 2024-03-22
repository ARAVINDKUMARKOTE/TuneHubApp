
package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.PlayList;

public interface PlayListRepository extends JpaRepository<PlayList, Integer>
{

}

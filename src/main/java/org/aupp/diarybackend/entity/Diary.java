package org.aupp.diarybackend.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "Diaries")
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Diary {
    @Id
    @Column(name = "diaryID")
    @Setter
    @Getter
    private int diaryID;

    @Column(name = "username")
    @Setter
    @Getter
    private String username;

    @Column(name = "title")
    @Setter
    @Getter
    private String title;

    @Column(name = "text")
    @Setter
    @Getter
    @Lob
    private String text;

    @Column(name = "createdDate")
    @Setter
    @Getter
    private String createdDate;
}

package com.record.company.com.domain.dto.album;

import com.record.company.com.domain.dto.artist.ArtistNameDto;
import com.record.company.com.domain.dto.musicGenders.MusicGenderDto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AlbumDto {

    private Integer id;

    private String titleAlbum;

    private int numberSongs;

    private ArtistNameDto artist;

    private Date publicationYear;

    private MusicGenderDto musicGender;

}

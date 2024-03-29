package com.record.company.com.domain.dto.album;

import com.record.company.com.domain.entity.MusicGenres;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AlbumMusicGenderDto {

    private Integer id;

    private MusicGenres musicGender;
}

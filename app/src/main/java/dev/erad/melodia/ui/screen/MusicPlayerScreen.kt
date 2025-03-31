package dev.erad.melodia.ui.screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import dev.erad.melodia.ui.components.CoverAlbumComponent
import dev.erad.melodia.ui.components.LyricsComponent
import dev.erad.melodia.ui.components.PlayingComponent
import dev.erad.melodia.ui.components.SongControllersComponent
import dev.erad.melodia.ui.components.SongTimeComponent
import dev.erad.melodia.ui.components.TitleSongComponent
import dev.erad.melodia.ui.theme.DtMFMusicPlayerTheme

@Composable
fun MusicPlayerScreen(modifier: Modifier = Modifier) {
    LazyColumn(
        modifier = modifier
            .padding(16.dp)
            .fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        item { PlayingComponent() }
        item { CoverAlbumComponent() }
        item { TitleSongComponent() }
        item { SongTimeComponent() }
        item { SongControllersComponent() }
        item { LyricsComponent() }
    }
}

@Preview(
    showBackground = true, device = Devices.PIXEL, showSystemUi = true
)
@Composable
fun GreetingPreview() {
    DtMFMusicPlayerTheme {
        MusicPlayerScreen()
    }
}
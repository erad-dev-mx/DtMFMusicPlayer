package dev.erad.frameforge.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import dev.erad.frameforge.R
import dev.erad.frameforge.ui.theme.DtMFMusicPlayerTheme

@Composable
fun CoverAlbumComponent(modifier: Modifier = Modifier) {
    val configuration = LocalConfiguration.current
    val screenWidth = configuration.screenWidthDp.dp
    val imageSize = screenWidth * 0.8f

    Box(
        modifier = modifier
            .size(imageSize + 3.dp)
            .background(MaterialTheme.colorScheme.secondary),
        contentAlignment = Alignment.Center
    ) {
        Image(
            painter = painterResource(R.drawable.dtmf),
            contentDescription = stringResource(R.string.cd_cover),
            modifier = modifier
                .fillMaxWidth()
                .size(imageSize)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun CoverAlbumComponentPreview() {
    DtMFMusicPlayerTheme {
        CoverAlbumComponent()
    }
}
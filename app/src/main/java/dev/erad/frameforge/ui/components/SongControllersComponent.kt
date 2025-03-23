package dev.erad.frameforge.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import dev.erad.frameforge.R
import dev.erad.frameforge.ui.theme.DtMFMusicPlayerTheme

@Composable
fun SongControllersComponent(modifier: Modifier = Modifier) {
    Row(
        modifier = modifier.padding(bottom = 64.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Image(
            painter = painterResource(R.drawable.ic_skip_back),
            contentDescription = "Last Page Icon",
            modifier = modifier
                .size(60.dp)
                .clickable { },
            colorFilter = ColorFilter.tint(MaterialTheme.colorScheme.secondary)
        )
        Spacer(modifier = modifier.width(8.dp))
        Image(
            painter = painterResource(R.drawable.ic_play),
            contentDescription = "Last Page Icon",
            modifier = modifier
                .size(100.dp)
                .clickable { },
            colorFilter = ColorFilter.tint(MaterialTheme.colorScheme.secondary)
        )
        Spacer(modifier = modifier.width(8.dp))
        Image(
            painter = painterResource(R.drawable.ic_skip_fwd),
            contentDescription = "Last Page Icon",
            modifier = modifier
                .size(60.dp)
                .clickable { },
            colorFilter = ColorFilter.tint(MaterialTheme.colorScheme.secondary)
        )
    }
}

@Preview
@Composable
fun SongControllersComponentPreview() {
    DtMFMusicPlayerTheme { SongControllersComponent() }
}
package uz.kotlinjon.todo.presentation.core

import android.graphics.drawable.shapes.Shape
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Shapes
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.CornerRadius
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import uz.kotlinjon.todo.presentation.ui.theme.CustomTheme

@Composable
fun GrayButton(
    text: String,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    enable: Boolean = true,
    radiusDp: Dp = 20.dp,
    bgColorAlfa: Float? = null,
    height: Dp = 48.dp,
    content: @Composable () -> Unit = {}
) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .wrapContentSize()
    ) {
        Box(
            modifier = Modifier
                .height(height)
                .clickable(
                    enabled = enable,
                    onClick = onClick
                )
                .fillMaxSize()
                .background(
                    color = CustomTheme.colorScheme.mainWhite2.copy(alpha = bgColorAlfa ?: 1f),
                    shape = RoundedCornerShape(radiusDp)
                )
                .padding(16.dp)
        ) {
            Text(
                text = text,
                modifier = Modifier
                    .align(Alignment.Center)
            )
        }
        content()
    }

}
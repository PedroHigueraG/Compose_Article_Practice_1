package com.example.composearticlepractice1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composearticlepractice1.ui.theme.ComposeArticlePractice1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeArticlePractice1Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    ArticleCard(
                        stringResource(R.string.article_title),
                        stringResource(R.string.article_description),
                        stringResource(R.string.article_body)
                    )
                }
            }
        }
    }
}

@Composable
fun ArticleCard(title: String, desc: String, body: String, modifier: Modifier = Modifier) {

    val image = painterResource(R.drawable.bg_compose_background)

    Column (
        modifier = modifier.fillMaxSize()
    ){
        Image(
            painter = image,
            contentDescription = null,
            modifier = modifier.fillMaxWidth()
        )
        Text(
            text = title,
            fontSize = 24.sp,
            modifier = modifier.padding(16.dp)
        )
        Text(
            text = desc,
            modifier = modifier.padding(16.dp),
            textAlign = TextAlign.Justify
        )
        Text(
            text = body,
            modifier = modifier.padding(16.dp),
            textAlign = TextAlign.Justify
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ComposeArticlePractice1Theme {
        ArticleCard(
            stringResource(R.string.article_title),
            stringResource(R.string.article_description),
            stringResource(R.string.article_body)
        )
    }
}
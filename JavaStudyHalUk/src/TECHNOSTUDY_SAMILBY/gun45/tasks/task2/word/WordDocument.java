package TECHNOSTUDY_SAMILBY.gun45.tasks.task2.word;


import TECHNOSTUDY_SAMILBY.gun45.tasks.task2.Document;

import java.util.List;

/*
Word document ->
  fileName: String
  docx:FileFormat

  pages: List
    title
    body
    footer
 */
public class WordDocument extends Document {
    private List<Page> pages;

}

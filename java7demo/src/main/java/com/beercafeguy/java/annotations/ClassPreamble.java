package com.beercafeguy.java.annotations;

import java.lang.annotation.Documented;

//@Documented means the annotation content will be added in java Docs
@Documented
public @interface ClassPreamble {
    String author();
    String date();
    int currentRevision() default 1;
    String lastModified() default "N/A";
    String lastModifiedBy() default "N/A";
    // Note use of array
    String[] reviewers();
}

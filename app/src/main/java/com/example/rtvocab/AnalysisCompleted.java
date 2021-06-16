package com.example.rtvocab;

import android.util.Pair;
import android.view.View;

import java.util.List;

public interface AnalysisCompleted {

    public void onAnalysisCompleted(List<String> tags);
    public void onTranslateCompleted(List<Pair<String,String>> results);
    public void onSelectCompleted(int position);
}

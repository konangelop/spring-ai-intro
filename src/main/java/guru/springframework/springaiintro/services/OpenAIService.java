package guru.springframework.springaiintro.services;

import guru.springframework.springaiintro.model.*;

public interface OpenAIService {

    GetCapitalResponse getCapital(GetCapitalRequest getCapitalRequest);
    GetCapitalWithInfoResponse getCapitalWithInfo(GetCapitalRequest getCapitalRequest);
    String getAnswer(String question);
    Answer getAnswer(Question question);
}

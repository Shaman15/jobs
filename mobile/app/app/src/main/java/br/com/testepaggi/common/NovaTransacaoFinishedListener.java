package br.com.testepaggi.common;

/**
 * © Copyright 2017.
 * Autor : Paulo Sales - paulovitorns@gmail.com
 */

public interface NovaTransacaoFinishedListener extends BaseCommonListener {
    void onSuccess(boolean isCreated);
}

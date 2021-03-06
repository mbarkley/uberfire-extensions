package org.uberfire.ext.properties.editor.client.widgets;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.BlurHandler;
import com.google.gwt.event.dom.client.FocusEvent;
import com.google.gwt.event.dom.client.FocusHandler;
import com.google.gwt.event.dom.client.KeyDownHandler;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Widget;
import org.gwtbootstrap3.client.ui.Input;
import org.gwtbootstrap3.client.ui.TextBox;

public class PropertyEditorPasswordTextBox extends AbstractPropertyEditorWidget {

    @UiField
    Input passwordTextBox;

    public PropertyEditorPasswordTextBox() {
        initWidget( uiBinder.createAndBindUi( this ) );
        passwordTextBox.addFocusHandler( new FocusHandler() {
            @Override
            public void onFocus( FocusEvent event ) {
                passwordTextBox.selectAll();
            }
        } );
    }

    public void setText( String text ) {
        passwordTextBox.setText( text );
    }

    public String getText() {
        return passwordTextBox.getText();
    }

    public void addKeyDownHandler( KeyDownHandler keyDownHandler ) {
        passwordTextBox.addKeyDownHandler( keyDownHandler );
    }

    public void addBlurHandler( BlurHandler blurHandler ) {
        passwordTextBox.addBlurHandler( blurHandler );
    }

    interface MyUiBinder extends UiBinder<Widget, PropertyEditorPasswordTextBox> {

    }

    private static MyUiBinder uiBinder = GWT.create( MyUiBinder.class );

}
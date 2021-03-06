/*
 * generated by Xtext 2.9.0
 */
package edu.ufcg.compiladores.pascal.idea.lang;

import com.intellij.openapi.fileTypes.FileTypeConsumer;
import com.intellij.openapi.fileTypes.FileTypeFactory;
import org.jetbrains.annotations.NotNull;

public class PascalFileTypeFactory extends FileTypeFactory {

	@Override
	public void createFileTypes(@NotNull FileTypeConsumer consumer) {
		consumer.consume(PascalFileType.INSTANCE, AbstractPascalFileType.DEFAULT_EXTENSION);
	}

}

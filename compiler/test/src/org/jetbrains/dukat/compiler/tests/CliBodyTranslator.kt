package org.jetbrains.dukat.compiler.tests

import org.jetbrains.dukat.astModel.SourceSetModel
import org.jetbrains.dukat.cli.translateWithBodyBinaryBundle
import org.jetbrains.dukat.moduleNameResolver.CommonJsNameResolver
import org.jetbrains.dukat.moduleNameResolver.ConstNameResolver
import org.jetbrains.dukat.ts.translator.createJsByteArrayWithBodyTranslator

class CliBodyTranslator : CliTranslator() {
    override fun translate(
        data: String
    ): SourceSetModel {
        val binData = translateBinary(data)
        val translator = createJsByteArrayWithBodyTranslator(CommonJsNameResolver(), null)
        return translator.translate(binData)
    }

    override fun translate(
        input: String,
        dirName: String,
        reportPath: String?,
        moduleName: String?,
        withDescriptors: Boolean
    ) {
        val binData = translateBinary(input)

        val moduleNameResolver = if (moduleName == null) {
            CommonJsNameResolver()
        } else {
            ConstNameResolver(moduleName)
        }

        translateWithBodyBinaryBundle(binData, dirName, moduleNameResolver, null, reportPath)
    }
}
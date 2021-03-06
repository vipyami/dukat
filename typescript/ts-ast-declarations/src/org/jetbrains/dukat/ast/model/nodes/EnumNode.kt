package org.jetbrains.dukat.ast.model.nodes

import org.jetbrains.dukat.ast.model.TopLevelNode
import org.jetbrains.dukat.astCommon.NameEntity

data class EnumNode(
        val name: NameEntity,
        val values: List<EnumTokenNode>,
        override val uid: String,
        override val external: Boolean
) : TopLevelNode, UniqueNode
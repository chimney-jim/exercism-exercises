object Bob {
  def response(statement: String): String = {
    val trimmedStatement = statement.trim
    if (trimmedStatement.isEmpty) "Fine. Be that way!"
    else if (isNormalQuestion(trimmedStatement)) "Sure."
    else if (isYellingNonQuestion(trimmedStatement)) "Whoa, chill out!"
    else if (isYellingQuestion(trimmedStatement)) "Calm down, I know what I'm doing!"
    else "Whatever."
  }

  private def isQuestion(statement: String): Boolean = {
    val notEmpty = !statement.isEmpty
    val lastCharIsQuestionMark = statement.last == '?'

    notEmpty && lastCharIsQuestionMark
  }

  private def isYelling(statement: String): Boolean = {
    val onlyLetters = statement.filter(_.isLetter)
    val hasLetters = !onlyLetters.isEmpty
    val allAreUppercase = onlyLetters.forall(_.isUpper)

    hasLetters && allAreUppercase
  }

  private def isNormalQuestion(statement: String): Boolean = {
    isQuestion(statement) && !isYelling(statement)
  }

  private def isYellingQuestion(statement: String): Boolean = {
    isQuestion(statement) && isYelling(statement)
  }


  private def isYellingNonQuestion(statement: String): Boolean = {
    !isQuestion(statement) && isYelling(statement)
  }
}

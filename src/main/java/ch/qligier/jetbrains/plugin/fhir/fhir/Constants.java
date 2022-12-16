// Copyright 2022 Quentin Ligier. Use of this source code is governed by the MIT license.

package ch.qligier.jetbrains.plugin.fhir.fhir;

import java.util.List;

/**
 * Some constants for FHIR.
 *
 * @author Quentin Ligier
 **/
public class Constants {

    /**
     * All known resource names.
     */
    public static final List<String> RESOURCE_NAMES = List.of("Account",
                                                              "ActivityDefinition",
                                                              "ActorDefinition",
                                                              "AdministrableProductDefinition",
                                                              "AdverseEvent",
                                                              "AllergyIntolerance",
                                                              "Appointment",
                                                              "AppointmentResponse",
                                                              "ArtifactAssessment",
                                                              "AuditEvent",
                                                              "Basic",
                                                              "Binary",
                                                              "BiologicallyDerivedProduct",
                                                              "BodyStructure",
                                                              "Bundle",
                                                              "CapabilityStatement",
                                                              "CarePlan",
                                                              "CareTeam",
                                                              "CatalogEntry",
                                                              "ChargeItem",
                                                              "ChargeItemDefinition",
                                                              "Citation",
                                                              "Claim",
                                                              "ClaimResponse",
                                                              "ClinicalImpression",
                                                              "ClinicalUseDefinition",
                                                              "CodeSystem",
                                                              "Communication",
                                                              "CommunicationRequest",
                                                              "CompartmentDefinition",
                                                              "Composition",
                                                              "ConceptMap",
                                                              "Condition",
                                                              "ConditionDefinition",
                                                              "Consent",
                                                              "Contract",
                                                              "Coverage",
                                                              "CoverageEligibilityRequest",
                                                              "CoverageEligibilityResponse",
                                                              "DetectedIssue",
                                                              "Device",
                                                              "DeviceDefinition",
                                                              "DeviceDispense",
                                                              "DeviceMetric",
                                                              "DeviceRequest",
                                                              "DeviceUsage",
                                                              "DeviceUseStatement",
                                                              "DiagnosticReport",
                                                              "DocumentManifest",
                                                              "DocumentReference",
                                                              "EffectEvidenceSynthesis",
                                                              "Encounter",
                                                              "Endpoint",
                                                              "EnrollmentRequest",
                                                              "EnrollmentResponse",
                                                              "EpisodeOfCare",
                                                              "EventDefinition",
                                                              "Evidence",
                                                              "EvidenceReport",
                                                              "EvidenceVariable",
                                                              "ExampleScenario",
                                                              "ExplanationOfBenefit",
                                                              "FamilyMemberHistory",
                                                              "Flag",
                                                              "FormularyItem",
                                                              "GenomicStudy",
                                                              "Goal",
                                                              "GraphDefinition",
                                                              "Group",
                                                              "GuidanceResponse",
                                                              "HealthcareService",
                                                              "ImagingSelection",
                                                              "ImagingStudy",
                                                              "Immunization",
                                                              "ImmunizationEvaluation",
                                                              "ImmunizationRecommendation",
                                                              "ImplementationGuide",
                                                              "Ingredient",
                                                              "InsurancePlan",
                                                              "InventoryReport",
                                                              "Invoice",
                                                              "Library",
                                                              "Linkage",
                                                              "List",
                                                              "Location",
                                                              "ManufacturedItemDefinition",
                                                              "Measure",
                                                              "MeasureReport",
                                                              "Media",
                                                              "Medication",
                                                              "MedicationAdministration",
                                                              "MedicationDispense",
                                                              "MedicationKnowledge",
                                                              "MedicationRequest",
                                                              "MedicationStatement",
                                                              "MedicationUsage",
                                                              "MedicinalProduct",
                                                              "MedicinalProductAuthorization",
                                                              "MedicinalProductContraindication",
                                                              "MedicinalProductDefinition",
                                                              "MedicinalProductIndication",
                                                              "MedicinalProductIngredient",
                                                              "MedicinalProductInteraction",
                                                              "MedicinalProductManufactured",
                                                              "MedicinalProductPackaged",
                                                              "MedicinalProductPharmaceutical",
                                                              "MedicinalProductUndesirableEffect",
                                                              "MessageDefinition",
                                                              "MessageHeader",
                                                              "MolecularSequence",
                                                              "NamingSystem",
                                                              "NutritionIntake",
                                                              "NutritionOrder",
                                                              "NutritionProduct",
                                                              "Observation",
                                                              "ObservationDefinition",
                                                              "OperationDefinition",
                                                              "OperationOutcome",
                                                              "Organization",
                                                              "OrganizationAffiliation",
                                                              "PackagedProductDefinition",
                                                              "Parameters",
                                                              "Patient",
                                                              "PaymentNotice",
                                                              "PaymentReconciliation",
                                                              "Permission",
                                                              "Person",
                                                              "PlanDefinition",
                                                              "Practitioner",
                                                              "PractitionerRole",
                                                              "Procedure",
                                                              "Provenance",
                                                              "Questionnaire",
                                                              "QuestionnaireResponse",
                                                              "RegulatedAuthorization",
                                                              "RelatedPerson",
                                                              "RequestGroup",
                                                              "RequestOrchestration",
                                                              "Requirements",
                                                              "ResearchDefinition",
                                                              "ResearchElementDefinition",
                                                              "ResearchStudy",
                                                              "ResearchSubject",
                                                              "RiskAssessment",
                                                              "RiskEvidenceSynthesis",
                                                              "Schedule",
                                                              "SearchParameter",
                                                              "ServiceRequest",
                                                              "Slot",
                                                              "Specimen",
                                                              "SpecimenDefinition",
                                                              "StructureDefinition",
                                                              "StructureMap",
                                                              "Subscription",
                                                              "SubscriptionStatus",
                                                              "SubscriptionTopic",
                                                              "Substance",
                                                              "SubstanceDefinition",
                                                              "SubstanceNucleicAcid",
                                                              "SubstancePolymer",
                                                              "SubstanceProtein",
                                                              "SubstanceReferenceInformation",
                                                              "SubstanceSourceMaterial",
                                                              "SubstanceSpecification",
                                                              "SupplyDelivery",
                                                              "SupplyRequest",
                                                              "Task",
                                                              "TerminologyCapabilities",
                                                              "TestReport",
                                                              "TestScript",
                                                              "Transport",
                                                              "ValueSet",
                                                              "VerificationResult",
                                                              "VisionPrescription");

    public static final List<String> PRIMITIVE_TYPE_NAMES = List.of("base64Binary",
                                                                    "boolean",
                                                                    "canonical",
                                                                    "code",
                                                                    "date",
                                                                    "dateTime",
                                                                    "decimal",
                                                                    "id",
                                                                    "instant",
                                                                    "integer",
                                                                    "integer64",
                                                                    "markdown",
                                                                    "oid",
                                                                    "positiveInt",
                                                                    "string",
                                                                    "time",
                                                                    "unsignedInt",
                                                                    "uri",
                                                                    "url",
                                                                    "uuid");

    public static final List<String> GENERAL_TYPE_NAMES = List.of("Address",
                                                                  "Age",
                                                                  "Annotation",
                                                                  "Attachment",
                                                                  "CodeableConcept",
                                                                  "Coding",
                                                                  "ContactPoint",
                                                                  "Count",
                                                                  "Distance",
                                                                  "Duration",
                                                                  "HumanName",
                                                                  "Identifier",
                                                                  "Money",
                                                                  "MoneyQuantity",
                                                                  "Period",
                                                                  "Quantity",
                                                                  "Range",
                                                                  "Ratio",
                                                                  "RatioRange",
                                                                  "SampledData",
                                                                  "Signature",
                                                                  "SimpleQuantity",
                                                                  "Timing");

    public static final List<String> METADATA_TYPE_NAMES = List.of("Availability",
                                                                   "ContactDetail",
                                                                   "Contributor",
                                                                   "DataRequirement",
                                                                   "Expression",
                                                                   "ExtendedContactDetail",
                                                                   "MonetaryComponent",
                                                                   "ParameterDefinition",
                                                                   "RelatedArtifact",
                                                                   "TriggerDefinition",
                                                                   "UsageContext",
                                                                   "VirtualServiceDetail");

    public static final List<String> SPECIAL_TYPE_NAMES = List.of("CodeableReference",
                                                                  "Dosage",
                                                                  "ElementDefinition",
                                                                  "Extension",
                                                                  "Meta",
                                                                  "Narrative",
                                                                  "Reference",
                                                                  "xhtml");
}